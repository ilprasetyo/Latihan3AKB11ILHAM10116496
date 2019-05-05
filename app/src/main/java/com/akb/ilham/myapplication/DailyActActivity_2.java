package com.akb.ilham.myapplication;

// Tgl Pengerjaan : 5 April 2019
// Nama : Ilham Prasetyo
// NIM : 10116496
// Kelas : AKB-11

public class DailyActActivity_2 {

        private String nama;
        private String npm;
        private String nohp;

        public DailyActActivity_2(String nama, String npm, String nohp) {
            this.nama = nama;
            this.npm = npm;
            this.nohp = nohp;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNpm() {
            return npm;
        }

        public void setNpm(String npm) {
            this.npm = npm;
        }

        public String getNohp() {
            return nohp;
        }

        public void setNohp(String nohp) {
            this.nohp = nohp;
        }
}
