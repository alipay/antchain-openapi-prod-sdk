<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class PushIcmInvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 批次号
    /**
     * @var string
     */
    public $pch;

    // 发票信息（json格式）
    /**
     * @var string
     */
    public $fpxx;

    // 发票类型
    // 01：增值税专用发票
    // 04：增值税普通发票
    // 10：增值税电子普通发票
    /**
     * @var string
     */
    public $fplx;

    // 是否是历史数据推送
    /**
     * @var bool
     */
    public $islsp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pch'               => 'pch',
        'fpxx'              => 'fpxx',
        'fplx'              => 'fplx',
        'islsp'             => 'islsp',
    ];

    public function validate()
    {
        Model::validateRequired('pch', $this->pch, true);
        Model::validateRequired('fpxx', $this->fpxx, true);
        Model::validateRequired('fplx', $this->fplx, true);
        Model::validateRequired('islsp', $this->islsp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pch) {
            $res['pch'] = $this->pch;
        }
        if (null !== $this->fpxx) {
            $res['fpxx'] = $this->fpxx;
        }
        if (null !== $this->fplx) {
            $res['fplx'] = $this->fplx;
        }
        if (null !== $this->islsp) {
            $res['islsp'] = $this->islsp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushIcmInvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['pch'])) {
            $model->pch = $map['pch'];
        }
        if (isset($map['fpxx'])) {
            $model->fpxx = $map['fpxx'];
        }
        if (isset($map['fplx'])) {
            $model->fplx = $map['fplx'];
        }
        if (isset($map['islsp'])) {
            $model->islsp = $map['islsp'];
        }

        return $model;
    }
}
