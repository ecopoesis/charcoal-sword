brew tap osgeo/osgeo4mac
brew install gdal2
brew link --force gdal2


ogrinfo -al raw/medford/L3_SHP_M176_MEDFORD -sql @get_all_gis_data.sql
ogr2ogr -f GeoJSON medford.geojson raw/medford/L3_SHP_M176_MEDFORD -sql @get_all_gis_data.sql -progress