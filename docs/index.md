![](image/affrep.png)

# Modul Praktikum Dasar Pemrograman

**Modul Praktikum Dasar Pemrograman menggunakan bahasa pemrograman Java**. Modul ini digunakan sebagai materi tambahan atau praktikum pada mata kuliah Dasar Pemrograman. 

> Dibuat dan dikelola oleh **Muhammad Affandes, M.T.** ([affandes@uin-suska.ac.id](mailto:affandes@uin-suska.ac.id))



## Silabus

Berikut adalah silabus yang digunakan di dalam modul praktikum ini.

1. **Pendahuluan**,  bagian ini berisi materi tentang dasar-dasar menampilkan teks pada layar, serta konsep komentar di dalam pemrograman.
2. **Variabel dan Tipe Data**, bagian ini berisi materi tentang variabel serta cara menggunakan variabel, jenis-jenis tipe data serta cara penggunaan masing-masing tipe data tersebut.
3. **Operator**, bagian ini berisi materi tentang beberapa operator penting yang biasa digunakan pada Java serta cara penggunaan masing-masing operator tersebut.
4. **Input dan Output**, bagian ini berisi tentang teknik dasar input dan output pada Java. Input meliputi keyboard dan file, sedangkan output meliputi layar monitor dan file.
5. **Percabangan**, bagian ini berisi tentang konsep percabangan menggunakan if dan switch.
6. **Perulangan**, bagian ini berisi tentang konsep perulangan menggunakan for dan while.



## Daftar Isi

[TOC]



## 1. Pendahuluan

Pada bagian ini mahasiswa diharapkan mampu memahami bagaimana membuat program menggunakan Java dengan bantuan aplikasi text editor atau IDE (Integrated Development Environment).

### 1.1 Program Salam

Jalankan program berikut ini.

```java
public class Salam {
    public static void main(String[] args) {
        System.out.println("Salam Programmer");
    }
}
```

Apabila program di atas dijalankan akan menampilkan kalimat "Salam Programmer" pada layar output program seperti berikut.

```bash
Salam Programmer
```

Untuk menjalankan program tersebut, anda harus menyimpan skrip program tersebut pada file dengan nama ```Salam.java``` kemudian di compile dan di jalankan.

### 1.2 Tanda Kutip

Setiap String atau teks pada Java harus diapit oleh tanda kutip-dua (double quote). Dengan demikian, untuk mencetak tanda kutip-dua diperlukan karakter khusus yang disebut dengan escape-character.

Jalankan program berikut ini.

```java
public class KutipSatu {
    public static void main(String[] args) {
        System.out.println("Nama Isma'il menggunakan tanda kutip satu.");
    }
}
```

Jalankan program berikut ini.

```java
public class KutipDua {
    public static void main(String[] args) {
        System.out.println("Budi berkata, \"Hari ini kita belajar Java.\" kepada Dodi.");
    }
}
```

Perhatikan output yang dihasilkan oleh kedua program tersebut.

### 1.3 Komentar

Komentar pada pemrograman digunakan untuk memberikan catatan dan dokumentasi yang berkenaan dengan skrip program tersebut. Komentar dapat ditulis dengan bahasa sehari-hari dan tidak diproses oleh program.

Jalankan dan perhatikan program berikut ini.

```java
public class Komentar01 {
    public static void main(String[] args) {
        // Ini adalah komentar

        /* Setiap komentar tidak akan diproses */

        /*
         * Komentar juga dapat ditulis lebih dari
         * satu baris. Berapapun banyaknya komentar
         * tetap tidak akan diproses. Sekalipun
         * diisi dengan koding. Misalnya:
         *
         * System.out.println("Tidak ditampilkan");
         */
        System.out.println("Ok, mengerti");
    }
}
```

### 1.4 Latihan 1

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Kalimat 1

   ```java
   public class Kalimat1 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1");
           System.out.println("Ini kalimat 2");
           System.out.println("Ini kalimat 3");
       }
   }
   ```

   

2. Program Kalimat 2

   ```java
   public class Kalimat2 {
       public static void main(String[] args) {
           System.out.print("Ini kalimat 1");
           System.out.print("Ini kalimat 2");
           System.out.print("Ini kalimat 3");
       }
   }
   ```

   

3. Program Kalimat 3

   ```java
   public class Kalimat3 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1 \n Ini kalimat 2 \n Ini kalimat 3");
       }
   }
   ```

   

4. Program Kalimat 4

   ```java
   public class Kalimat4 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1");
           System.out.print("Ini kalimat 2");
           System.out.println("Ini kalimat 3");
           System.out.print("Ini kalimat 4");
           System.out.println("Ini kalimat 5");
       }
   }
   ```

   

### 1.5 Latihan 2

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Tanda Kutip

   ```java
   public class TandaKutip {
       public static void main(String[] args) {
           System.out.println("Al Qur'an dan Hadist");
           System.out.println("Sesuai Syari'at");
           System.out.println("Surat Al Waqi'ah");
       }
   }
   ```

   

2. Program Tanda Kutip-Dua

   ```java
   public class TandaKutipDua {
       public static void main(String[] args) {
           System.out.println("Kata \"computer\" berasal dari kata \"compute\" yang berarti menghitung.");
       }
   }
   ```

   

3. Program Biodata

   ```java
   public class Biodata {
       public static void main(String[] args) {
           System.out.println("Nama \t : Muhammad Affandes");
           System.out.println("Email \t : affandes@uin-suska.ac.id");
       }
   }
   ```

   

4. Program Skrip

   ```java
   public class Skrip {
       public static void main(String[] args) {
           System.out.println("System.out.println(\"Salam\"); => Salam");
       }
   }
   ```

   

### 1.6 Latihan 3

Buatlah program yang menghasilkan output seperti di bawah ini.

1. Output 1

   ```bash
   Andi 	: “Assalammu’alaikum”.
   Budi 	: “Wa’alaikumsalam”.
   Andi 	: “Bagaimana kabarnya?”.
   Budi 	: “Luar biasa, Alhamdulillah”.
   ```

   

2. Output 2

   ```bas
   Citra	: “Ded, hari ini kita kuliah apa?”.
   Dedi 	: “Kuliah ‘Dasar Pemrograman’, Cit”.
   Citra	: “Lho, kuliah ‘Al Qur’an dan Hadits’ kapan?”.
   Dedi	: “Besok, Cit”.
   ```

   

3. Output 3

   ```bas
   *====================*
   | Selamat Belajar    |
   | Dasar Pemrograman  |
   | Menggunakan Java   |
   *====================*
   ```



### 1.7 Latihan 4

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Komentar 1

   ```java
   public class KomentarKalimat1 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           // System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4");
       }
   }
   ```

   

2. Program Komentar 2

   ```java
   public class KomentarKalimat2 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           /* System.out.println("Baris ke 2"); */
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4");
       }
   }
   ```

   

3. Program Komentar 3

   ```java
   public class KomentarKalimat3 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           /* System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4"); */
       }
   }
   ```

   

4. Program Komentar 4

   ```java
   public class KomentarKalimat4 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           System.out.println("Baris ke 2"); /* komentar 1 */
           System.out.println("Baris ke 3"); // komentar 2
           System.out.println("Baris ke 4");
       }
   }
   ```

   

5. Program Komentar 5

   ```jav
   public class KomentarKalimat5 {
       public static void main(String[] args) {
           // Skrip untuk menampilkan Baris
           System.out.println("Baris ke 1");
           System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           // Skrip untuk menampilkan Kalimat
           System.out.println("Kalimat ke 1");
           System.out.println("Kalimat ke 2");
           System.out.println("Kalimat ke 3");
       }
   }
   ```

   

### 1.8 Latihan 5

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

Program Kotak Biodata

```java
public class KotakBiodata {
    public static void main(String[] args) {
        /*
         * Ini adalah skrip program untuk menampilkan biodata saya.
         * Author : Muhammad Affandes
         * Email  : affandes@uin-suska.ac.id
         * Create : July 30, 2016 17:19:26
         */
        System.out.println("===========================================");
        System.out.println(" Biodata Saya ");
        System.out.println("-------------------------------------------");
        System.out.println(" Nama \t : Muhammad Affandes");
        System.out.println(" Email \t : affandes@uin-suska.ac.id");
        System.out.println("===========================================");
    }
}
```



## 2. Variabel dan Tipe Data

### Variabel

#### Konsep

#### Contoh

### Tipe Data

## 3. Operator

### Operator Aritmatika

### Operator Increment dan Decrement

### Operator Perbandingan

### Operator Logika

## 4. Input dan Output

### Scanner

### BufferedReader

### JOptionPane

### Input dari File

### Output ke File

## 5. Percabangan

### Percabangan If dan If Else

### Percabangan Switch Case

## 6. Perulangan

### Perulangan For

### Perulangan While dan Do While

## Lisensi

Lisensi di bawah GNU Public License.

Copyright © 2019 oleh Muhammad Affandes ([affandes@uin-suska.ac.id](mailto:affandes@uin-suska.ac.id))