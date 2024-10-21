@import br.dev.darioteodoro.cv.model.Acknowledge
@param Acknowledge ack

<div class="acknowledge p-0 ml-0 mt-3">
    <div class="education-info">
            @if(ack.getEducations() != null)
                <ul>
                    @for(var edu : ack.getEducations())
                        <li class="education">
                            <h3 class="degree">${edu.getDegree()}</h3>
                            <h5 class="school-name">${edu.getSchollName()}</h5>
                            <h6 class="school-location">${edu.getSchollLocation()}</h6>
                            <div class="school-period">${edu.getPeriod().getPeriodDescription()}</div>
                        </li>
                    @else
                        <p>no result</p>
                    @endfor
                </ul>
            @endif
    </div>
    <div class="languages">
        @if(ack.getLanguages() != null)
            <ul>
                @for(var lang : ack.getLanguages())
                    <li class="language">
                        <h3 class="language-name">${lang.description()}</h3>
                        <h4 class="language-level">${lang.level()}</h4>
                    </li>
                @else
                    <p>no result</p>
                @endfor
            </ul>
        @endif
    </div>
    <div class="skill-info">
        @if(ack.getSkill() != null)
            <ul>
                @for(var skill : ack.getSkill())
                    <li class="skill">
                        <h2 class="skill-info">${skill.description()}</h2>
                    </li>
                @else
                    <p>no result</p>
                @endfor
            </ul>
        @endif
    </div>
</div>