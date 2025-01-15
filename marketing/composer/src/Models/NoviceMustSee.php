<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class NoviceMustSee extends Model
{
    // novice_must_see_explain
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeExplain;

    // novice_must_see_title1
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeTitle1;

    // novice_must_see_address1
    /**
     * @example 12
     *
     * @var string
     */
    public $noviceMustSeeAddress1;

    // novice_must_see_title2
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeTitle2;

    // novice_must_see_address2
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeAddress2;

    // novice_must_see_title3
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeTitle3;

    // novice_must_see_address3
    /**
     * @example ""
     *
     * @var string
     */
    public $noviceMustSeeAddress3;
    protected $_name = [
        'noviceMustSeeExplain'  => 'novice_must_see_explain',
        'noviceMustSeeTitle1'   => 'novice_must_see_title1',
        'noviceMustSeeAddress1' => 'novice_must_see_address1',
        'noviceMustSeeTitle2'   => 'novice_must_see_title2',
        'noviceMustSeeAddress2' => 'novice_must_see_address2',
        'noviceMustSeeTitle3'   => 'novice_must_see_title3',
        'noviceMustSeeAddress3' => 'novice_must_see_address3',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->noviceMustSeeExplain) {
            $res['novice_must_see_explain'] = $this->noviceMustSeeExplain;
        }
        if (null !== $this->noviceMustSeeTitle1) {
            $res['novice_must_see_title1'] = $this->noviceMustSeeTitle1;
        }
        if (null !== $this->noviceMustSeeAddress1) {
            $res['novice_must_see_address1'] = $this->noviceMustSeeAddress1;
        }
        if (null !== $this->noviceMustSeeTitle2) {
            $res['novice_must_see_title2'] = $this->noviceMustSeeTitle2;
        }
        if (null !== $this->noviceMustSeeAddress2) {
            $res['novice_must_see_address2'] = $this->noviceMustSeeAddress2;
        }
        if (null !== $this->noviceMustSeeTitle3) {
            $res['novice_must_see_title3'] = $this->noviceMustSeeTitle3;
        }
        if (null !== $this->noviceMustSeeAddress3) {
            $res['novice_must_see_address3'] = $this->noviceMustSeeAddress3;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NoviceMustSee
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['novice_must_see_explain'])) {
            $model->noviceMustSeeExplain = $map['novice_must_see_explain'];
        }
        if (isset($map['novice_must_see_title1'])) {
            $model->noviceMustSeeTitle1 = $map['novice_must_see_title1'];
        }
        if (isset($map['novice_must_see_address1'])) {
            $model->noviceMustSeeAddress1 = $map['novice_must_see_address1'];
        }
        if (isset($map['novice_must_see_title2'])) {
            $model->noviceMustSeeTitle2 = $map['novice_must_see_title2'];
        }
        if (isset($map['novice_must_see_address2'])) {
            $model->noviceMustSeeAddress2 = $map['novice_must_see_address2'];
        }
        if (isset($map['novice_must_see_title3'])) {
            $model->noviceMustSeeTitle3 = $map['novice_must_see_title3'];
        }
        if (isset($map['novice_must_see_address3'])) {
            $model->noviceMustSeeAddress3 = $map['novice_must_see_address3'];
        }

        return $model;
    }
}
