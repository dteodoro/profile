@import br.dev.darioteodoro.cv.model.WorkExperience
@param WorkExperience experience

<div class="work-experience">
    @if(experience.getWorks() != null)
    <ul>
        @for(var work : experience.getWorks())
            <li class="experience">
                <h1 class="company">${work.getCompanyName()}</h1>
                <h3 class="location">${work.getCompanyLocation()}</h3>
                <h3 class="fullperiod">${work.getFullPeriod()}</h3>
                @if(work.getWorkRoles() !=null)
                    <ul>
                        @for(var role : work.getWorkRoles())
                            <li>
                                <h2 class="title">${role.getTitle()}</h2>
                                <h3 class="period">${role.getPeriodDescription()}</h3>
                                <p class="experience-description">
                                    ${role.getDescription()}
                                </p>
                            </li>
                        @else
                            <p>no result</p>
                        @endfor
                    </ul>
                @endif
            </li>
        @else
            <p>no result</p>
        @endfor
    </ul>
    @endif
</div>