<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PleaderObject extends Model
{
    // 法人或自然人标识，法人为0，自然人为1
    /**
     * @example 0
     *
     * @var int
     */
    public $partyType;

    // 自然人信息
    // 当partyType=1必填
    /**
     * @example
     *
     * @var NaturalPerson
     */
    public $naturalPerson;

    // 法人信息
    // 当partyType=0必填
    /**
     * @example
     *
     * @var LegalPerson
     */
    public $legalPerson;
    protected $_name = [
        'partyType'     => 'party_type',
        'naturalPerson' => 'natural_person',
        'legalPerson'   => 'legal_person',
    ];

    public function validate()
    {
        Model::validateRequired('partyType', $this->partyType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partyType) {
            $res['party_type'] = $this->partyType;
        }
        if (null !== $this->naturalPerson) {
            $res['natural_person'] = null !== $this->naturalPerson ? $this->naturalPerson->toMap() : null;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = null !== $this->legalPerson ? $this->legalPerson->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PleaderObject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['party_type'])) {
            $model->partyType = $map['party_type'];
        }
        if (isset($map['natural_person'])) {
            $model->naturalPerson = NaturalPerson::fromMap($map['natural_person']);
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = LegalPerson::fromMap($map['legal_person']);
        }

        return $model;
    }
}
