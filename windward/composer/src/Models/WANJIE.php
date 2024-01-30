<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WINDWARD\Models;

use AlibabaCloud\Tea\Model;

class WANJIE extends Model
{
    // code
    /**
     * @example 00
     *
     * @var string
     */
    public $code;

    // abilityAttribute
    /**
     * @example abilityAttribute
     *
     * @var string
     */
    public $abilityAttribute;

    // pastAttribute
    /**
     * @example pastAttribute
     *
     * @var string
     */
    public $pastAttribute;

    // stabilityAttribute
    /**
     * @example stabilityAttribute
     *
     * @var string
     */
    public $stabilityAttribute;
    protected $_name = [
        'code'               => 'code',
        'abilityAttribute'   => 'ability_attribute',
        'pastAttribute'      => 'past_attribute',
        'stabilityAttribute' => 'stability_attribute',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('abilityAttribute', $this->abilityAttribute, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->abilityAttribute) {
            $res['ability_attribute'] = $this->abilityAttribute;
        }
        if (null !== $this->pastAttribute) {
            $res['past_attribute'] = $this->pastAttribute;
        }
        if (null !== $this->stabilityAttribute) {
            $res['stability_attribute'] = $this->stabilityAttribute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WANJIE
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['ability_attribute'])) {
            $model->abilityAttribute = $map['ability_attribute'];
        }
        if (isset($map['past_attribute'])) {
            $model->pastAttribute = $map['past_attribute'];
        }
        if (isset($map['stability_attribute'])) {
            $model->stabilityAttribute = $map['stability_attribute'];
        }

        return $model;
    }
}
