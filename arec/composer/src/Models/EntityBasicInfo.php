<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class EntityBasicInfo extends Model
{
    // 名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 证件类型，可选值：ID_CARD,BUSINESS_LICENSE,UNIFIED_SOCIAL_CODE
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @example 511381198808281121
     *
     * @var string
     */
    public $certNo;
    protected $_name = [
        'name'     => 'name',
        'certType' => 'cert_type',
        'certNo'   => 'cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EntityBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }

        return $model;
    }
}
