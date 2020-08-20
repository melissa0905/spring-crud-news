SELECT * FROM public.Etkinlik
ORDER BY id ASC 
CREATE TABLE `duyuru` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `baslik` chararackter(512) CHARACTER SET utf8 DEFAULT NULL,
  `konu` character(512) CHARACTER SET utf8 DEFAULT NULL,
  `icerik` character (11) DEFAULT NULL,
  PRIMARY KEY (`id`)
  FOREIGN KEY('etkinlik_id')
) 