<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPContactInfo extends Model
{
    // 联系人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 联系人手机号码
    /**
     * @example 1388888888
     *
     * @var string
     */
    public $mobile;

    // 联系人电话号码
    /**
     * @example 0551-12345678
     *
     * @var string
     */
    public $phone;

    // 联系人类型, 1-法人；2-实际控制人；3-代理人；4-其他
    /**
     * @example 1
     *
     * @var int
     */
    public $type;

    // 联系人身份证号
    /**
     * @example 320000000000000000
     *
     * @var string
     */
    public $certno;

    // 联系人证件类型
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $certType;
    protected $_name = [
        'name'     => 'name',
        'mobile'   => 'mobile',
        'phone'    => 'phone',
        'type'     => 'type',
        'certno'   => 'certno',
        'certType' => 'cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->certno) {
            $res['certno'] = $this->certno;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPContactInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['certno'])) {
            $model->certno = $map['certno'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
