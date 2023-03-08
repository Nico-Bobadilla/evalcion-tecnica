--Nombre de la ventana con AD_Window_ID = '100':
SELECT Name FROM AD_Window WHERE AD_Window_ID = 100;

--Actualice la ventana con AD_Window_ID = '100' agregando '--' al nombre de ventana con AD_Window_ID = '100':
UPDATE AD_Window SET Name = Name || '--' WHERE AD_Window_ID = 100;

--Lista de todas las pestañas en la ventana con AD_Window_ID = '100':
SELECT Name FROM AD_Tab WHERE AD_Window_ID = 100;

--Lista de nombre de pestaña + nombre de campo de todas las pestañas en AD_Window_ID = '100' ordenados por pestaña nombre y nombre de campo:
SELECT t.Name AS TabName, f.Name AS FieldName
FROM AD_Tab t
INNER JOIN AD_Field f ON t.AD_Tab_ID = f.AD_Tab_ID
WHERE t.AD_Window_ID = 100
ORDER BY t.Name, f.Name;

--Nombre y número de pestañas de todas las ventanas:
SELECT w.Name, COUNT(t.AD_Tab_ID) AS TabCount
FROM AD_Window w
LEFT JOIN AD_Tab t ON w.AD_Window_ID = t.AD_Window_ID
GROUP BY w.Name;

--Lista de las ventanas con su número de campos
SELECT w.Name, COUNT(f.AD_Field_ID) AS FieldCount
FROM AD_Window w
LEFT JOIN AD_Tab t ON w.AD_Window_ID = t.AD_Window_ID
LEFT JOIN AD_Field f ON t.AD_Tab_ID = f.AD_Tab_ID
GROUP BY w.AD_Window_ID, w.Name
ORDER BY FieldCount DESC;

--Ventanas con más de 5 pestañas:
SELECT w.Name, COUNT(t.AD_Tab_ID) AS TabCount
FROM AD_Window w
LEFT JOIN AD_Tab t ON w.AD_Window_ID = t.AD_Window_ID
GROUP BY w.Name
HAVING COUNT(t.AD_Tab_ID) > 5;

