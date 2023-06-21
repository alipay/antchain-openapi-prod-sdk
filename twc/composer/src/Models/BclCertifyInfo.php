<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclCertifyInfo extends Model
{
    // 认证url 如果status待认证,该字段非空,
    // 如果认证失败,这里的新的认证链接,支持重复认证
    /**
     * @example https://asdqweqw.com/asd
     *
     * @var string
     */
    public $certifyUrl;

    // 认证描述
    /**
     * @example 通过
     *
     * @var string
     */
    public $resultDesc;

    // 认证状态
    // 待认证  INIT
    // 认证成功 PASS
    // 认证失败 FAIL
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'certifyUrl' => 'certify_url',
        'resultDesc' => 'result_desc',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certifyUrl) {
            $res['certify_url'] = $this->certifyUrl;
        }
        if (null !== $this->resultDesc) {
            $res['result_desc'] = $this->resultDesc;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclCertifyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certify_url'])) {
            $model->certifyUrl = $map['certify_url'];
        }
        if (isset($map['result_desc'])) {
            $model->resultDesc = $map['result_desc'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
