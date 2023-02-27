# Services

## Iniciando um serviço em segundo plano(Background) - Started Service:

**Service** - é a classe base para todos os serviços. Ao estender essa classe é importante criar uma nova thread onde o serviço possa ser finalizado. Por padrão, o serviço usa a thread principal do aplicativo, o que pode reduzir a velocidade do desempenho de qualquer atividade que a aplicação esteja executando.

**Exemplos:**

- Sincronização de dados em segundo plano.
- Reprodução de música.
- Download de arquivos.

**Existem 3 tipos de serviço:**

- **Serviço de primeiro plano (Foreground)** **⇒** realiza uma operação **perceptível** ao usuário e precisa exibir uma notificação. **Um aplicativo de áudio usaria um serviço em primeiro plano para reproduzir uma faixa de áudio.**
- **Serviço de segundo plano (Background)** **⇒** realiza uma operação que **não é perceptível** ao usuário. Serviços iniciados (**Started Services**) são ótimos para as operações em background que continuam rodando independente de qual aplicativo o usuários está usando.
- **Serviço vinculado (Bound) ⇒** um tipo de serviço que a **activity pode interagir**. O serviço vinculado permanece em execução enquanto um outro componente da aplicação está vinculado a ele. **Por exemplo:** quando o serviço de localização do Android envia atualização sobre a localização do usuário pelo GPS.

### **⇒ Declaração do service no arquivo manifest**

É necessário **declarar todos os serviços** no arquivo manifest do aplicativo. Elementos `[<service>](https://developer.android.com/guide/topics/manifest/service-element)` para serviços.

### **⇒ Como ativar/usar o service**

A ativação deste componente é feita por *intent/mensagem, que especifica o serviço e inclui os dados que serão usados por ele.*

```kotlin
Intent(this, ExampleService::class.java).also { intent ->
    startService(intent)
}
```

O código demonstra um serviço customizado, mas é recomendado usar o **WorkManager** para a maioria dos casos.

Fontes:

[https://developer.android.com/guide/background](https://developer.android.com/guide/background)

Link do tutorial: https://www.youtube.com/watch?v=z9zYHugV_Fg
