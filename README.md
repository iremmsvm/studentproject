## 📚 Öğrenci - Ödev Takip Sistemi

Bu proje, öğrenci ve ödev verilerinin yönetimini sağlayan RESTful bir web servis uygulamasıdır. Proje kapsamında öğrenciler sisteme tanımlanabilir, ödevler (alıştırma veya proje tipi) oluşturulabilir ve öğrencilere ödev atanabilir. Uygulama, Java 17 ve Spring Boot kullanılarak geliştirilmiştir.

---

### 🛠️ Kullanılan Teknolojiler

* **Java 17**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **H2 In-Memory Database**
* **Maven**
* **JUnit 5 & Mockito**
* **GitHub Actions (CI/CD)**
* **Postman & JMeter**

---

### 🔌 REST Servisleri

| Endpoint                   | Açıklama                                    |
| -------------------------- | ------------------------------------------- |
| `POST /assignments`        | Yeni ödev oluşturur (tipi: alıştırma/proje) |
| `GET /assignments`         | Tüm ödevleri listeler                       |
| `POST /assignments/assign` | Bir öğrenciye ödev ataması yapar            |
| `GET /students`            | Öğrencileri ve atanmış ödevlerini listeler  |

---

### 🗃️ Ödev Tipleri

1. **Alıştırma (Exercise):** Soru sayısı içerir
2. **Proje (Project):** Grup projesi mi bilgisi içerir

---

### 🧪 Test & Coverage

* JUnit ile birim testler yazılmıştır.
* Maven ile test coverage (%kapsama) HTML raporu üretilmiştir.
* Postman ve JMeter ile API testleri yapılmıştır.

---

### ♻️ CI/CD

* Proje GitHub Actions ile sürekli entegrasyon sistemine entegre edilmiştir.
* Her `push` sonrası otomatik build ve test yapılmaktadır.

---

### 🚀 Deployment

Uygulama Railway üzerinden yayına alınmıştır.

> **Canlı Uygulama Linki:**
> [https://studentproject-production.up.railway.app](https://studentproject-production.up.railway.app)

---

### 🧾 Kullanım Notları

* Proje in-memory veritabanı (H2) ile çalışır.
* Uygulama başladığında tüm veriler sıfırlanır.
* API testleri için Postman kullanılması önerilir.

---

### 👩‍💻 Geliştirici

**Ad:** Nesibe İrem Sevim
**Üniversite:** İstanbul Medipol Üniversitesi – Bilgisayar Programcılığı
**GitHub:** [github.com/iremmsvm](https://github.com/iremmsvm)
