/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: false,
  mode: 'jit'
  purge:[ './public/**/*.html',
              './src/**/*.{js,jsx,ts,tsx,vue}',],
  content: [],
  theme: {
    extend: {
      colors:{
        primary: '#e66060',
        secondary: '200015',
      },
      fontFamily: {
              sans: ['Monaco', 'Arial', 'Helvetica', 'sans-serif'],
      },
    },
  },
  plugins: [],
}

