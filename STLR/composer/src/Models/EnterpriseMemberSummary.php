<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseMemberSummary extends Model
{
    // 机构会员DID
    /**
     * @example did:mychain:aa509301d1c2bd0e35f9737824e5ab9832ca9a09542d618bce24a1609191383c
     *
     * @var string
     */
    public $accountDid;

    // 会员姓名，数据脱敏处理返回
    /**
     * @example 张**
     *
     * @var string
     */
    public $name;

    // 会员手机号码，数据脱敏处理返回
    /**
     * @example 136****1122
     *
     * @var string
     */
    public $mobile;

    // 会员注册时间
    /**
     * @example 2022-02-22 12:33:11
     *
     * @var string
     */
    public $registerTime;
    protected $_name = [
        'accountDid'   => 'account_did',
        'name'         => 'name',
        'mobile'       => 'mobile',
        'registerTime' => 'register_time',
    ];

    public function validate()
    {
        Model::validateRequired('accountDid', $this->accountDid, true);
        Model::validateRequired('registerTime', $this->registerTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseMemberSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }

        return $model;
    }
}
