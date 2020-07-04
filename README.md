# PAOO_EX5_SPRINGBOOT

### Bug ao adicionar novo veículo.

Ao tentar adicionar um novo veículo, ele tenta adicionar todos os carros existentes novamente no banco de dados, gerando conflito de duplicidade de id.

Acreditamos que podemos resolver este bug criando uma classe serviço para executar a persistência dos dados
