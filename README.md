# Backend ERP menggunakan Spring Boot
Ini adalah proyek backend ERP yang dikembangkan menggunakan Java dengan Spring Boot untuk memenuhi kebutuhan sistem manajemen sumber daya perusahaan (ERP). Proyek ini menyediakan layanan RESTful API untuk berbagai fungsi seperti manajemen pengguna, manajemen produk, manajemen pesanan, dan sebagainya.

## Teknologi yang Digunakan
- **Java 17:** Bahasa pemrograman utama.
- **Spring Boot:** Framework Java untuk membangun aplikasi berbasis mikro.
- **Spring Data JPA:** Untuk interaksi dengan database.
- **Spring Security:** Untuk keamanan aplikasi.
- **PostgreSQL:** Database untuk menyimpan data.

## Instalasi
1. **Persyaratan:** Pastikan Anda telah menginstal Java 17 dan PostgreSQL.
2. **Clone Repositori:** git clone https://github.com/yasirmaulana/yasir-erp-v1.git
3. **Konfigurasi Database:**
    - Buat database PostgreSQL baru dengan nama erp
    - Konfigurasi koneksi database di file application.yml
    ```
    url: jdbc:postgresql://localhost:5432/erp
    username: your_username
    password: your_password

## Penggunaan API
