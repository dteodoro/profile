@import br.dev.darioteodoro.cv.model.Profile

@param Profile profile

@template.layout.base(content = @`
    <div class="row m-2">
        <header class="col-3 mt-1 p-1">
            <section class="details-container mb-1">
                @template.fragments.details(person = profile.getPerson())
            </section>
            <section class="acknowledge-container mb-1">
                @template.fragments.acknowledge(ack = profile.getAcknowledge())
            </section>
        </header>
        <main class="col m-2">
            <section class="profile-container mb-1">
                @template.fragments.profile(description = profile.getDescription())
            </section>
            <section class="work-experience-container mb-1">
                @template.fragments.workExperience(experience = profile.getWorkExperience())
            </section>
        </main>
    </div>
`)
