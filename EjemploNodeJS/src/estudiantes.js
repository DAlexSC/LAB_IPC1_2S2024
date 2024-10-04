const express = require('express');
const router = express.Router();

// Endpoint GET para obtener la lista de estudiantes
router.get('/', (req, res) => {
  const estudiantes = [
    { id: 1, nombre: 'Estudiante 1', edad: 21 },
    { id: 2, nombre: 'Estudiante 2', edad: 22 },
    { id: 3, nombre: 'Estudiante 3', edad: 23 }
  ];
  res.json(estudiantes);
});

// Endpoint POST para crear un nuevo estudiante
router.post('/', (req, res) => {
  const nuevoEstudiante = req.body;  // Asumimos que el estudiante viene en el cuerpo de la solicitud
  res.status(201).json({ message: 'Estudiante creado', estudiante: nuevoEstudiante });
});

module.exports = router;