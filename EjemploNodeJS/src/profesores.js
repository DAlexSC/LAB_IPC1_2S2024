const express = require('express');
const router = express.Router();

// Endpoint GET para obtener la lista de profesores
router.get('/', (req, res) => {
  const profesores = [
    { id: 1, nombre: 'Profesor 1', edad: 21 },
    { id: 2, nombre: 'Profesor 2', edad: 22 },
    { id: 3, nombre: 'Profesor 3', edad: 23 }
  ];
  res.json(profesores);
});

// Endpoint POST para crear un nuevo estudiante
router.post('/', (req, res) => {
  const nuevoProfesor = req.body;  // Asumimos que el estudiante viene en el cuerpo de la solicitud
  res.status(201).json({ message: 'Profesor creado', estudiante: nuevoProfesor });
});

module.exports = router;