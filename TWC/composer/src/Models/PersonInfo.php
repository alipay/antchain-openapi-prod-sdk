<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PersonInfo extends Model
{
    // 个人证件名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $certName;

    // 个人证件号码
    /**
     * @example 512223********1245
     *
     * @var string
     */
    public $certNo;

    // 证件类型, 默认身份证 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
    /**
     * @example RESIDENT
     *
     * @var string
     */
    public $certType;
    protected $_name = [
        'certName' => 'cert_name',
        'certNo'   => 'cert_no',
        'certType' => 'cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
