# Verificación de Informes de Niveles 

¡Bienvenido al desafío de **Verificación de Informes de Niveles**! Esto es parte de un reto de Advent of Code, donde analizamos datos inusuales para ayudar a los ingenieros en la planta de fusión/fisión nuclear del Reno de Nariz Roja. 

---

## 📖 Descripción del Problema

Los ingenieros te han dado **informes del reactor** para analizar. Cada informe consiste en una serie de números llamados "niveles," listados en una sola línea. Por ejemplo:

El **objetivo** es determinar cuántos de estos informes son "seguros."

---

## 🚦 Reglas de Seguridad

Un informe es **seguro** si cumple con ambas condiciones:
1. **Tendencia Consistente**: Los niveles deben ser **todos crecientes** o **todos decrecientes**.
2. **Diferencias Aceptables**: La diferencia entre dos niveles adyacentes debe ser al menos `1` y como máximo `3`.

### Análisis de Ejemplo

| Informe        | Análisis                                                               | ¿Seguro? |
|----------------|------------------------------------------------------------------------|----------|
| `7 6 4 2 1`    | Los niveles están disminuyendo por 1 o 2.                              | ✅ Sí     |
| `1 2 7 8 9`    | `2 -> 7` aumenta por 5 (demasiado grande).                             | ❌ No     |
| `9 7 6 2 1`    | `6 -> 2` disminuye por 4 (demasiado grande).                           | ❌ No     |
| `1 3 2 4 5`    | La tendencia es mixta: creciente (`1 -> 3`) y decreciente (`3 -> 2`).  | ❌ No     |
| `8 6 4 4 1`    | Contiene un nivel repetido (`4 -> 4` no es ni aumento ni disminución). | ❌ No     |
| `1 3 6 7 9`    | Los niveles están aumentando por 1, 2 o 3.                             | ✅ Sí     |

De lo anterior, **2 informes son seguros**.

---

## ✏️ Formato de Entrada

- La entrada es una serie de informes, uno por línea.
- Cada informe contiene enteros separados por espacios.



/**
 * This code is part of a project inspired by the Advent of Code challenges.
 * For more information, visit: https://adventofcode.com/
 */
