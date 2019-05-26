package akuchars

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc


@SpringBootApplication
@EnableWebMvc
class ApplicationRunner

fun main(args: Array<String>) {
    runApplication<ApplicationRunner>(*args)
}