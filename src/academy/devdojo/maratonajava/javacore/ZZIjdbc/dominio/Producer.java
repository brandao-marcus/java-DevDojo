package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder

public final class Producer {
    private Integer id;
    private String name;

    public Producer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer(id, name);
            producer.name = this.name;
            producer.id = this.id;
            return producer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
