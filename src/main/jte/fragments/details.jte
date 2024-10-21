@import br.dev.darioteodoro.cv.model.Person
 
@param Person person

 <div class="details">
    <div class="contact-header">
         <image class="photo"></image>
         <h2 class="fullname">Dário Teodoro</h2>
         <h4 class="headline">Java Software Developer</h4>
    </div>
    <div class="contact-info mt-4">
        @if(person.getContacts().isEmpty())
            <p>No results</p>
        @else
            <ul class="contact-list">
                @for(var contact : person.getContacts())
                    <li class="contact">
                        <span class="contact-logo">${contact.getLogoURL()}</span>
                        <h5 class="contact-description">${contact.getDescription()}</h5>
                    </li>
                @endfor
            </ul>
        @endif
    </div>
</div>
<style>
    .contact-header{
        text-align: center;
    }
    .contact-info{
        text-align: center;
    }
    .details{
        border: 1px solid gray;
        border-radius: 5%;
        padding: 0 5px 0 5px;
    }
    ul{
        list-style-type: none;
    }
</style>