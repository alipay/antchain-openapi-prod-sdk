<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class DescribeIcmInvoiceRequest extends Model
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

    // 发票销方税号
    /**
     * @var string
     */
    public $xfsh;

    // 发票代码
    /**
     * @var string
     */
    public $fpdm;

    // 发票号码
    /**
     * @var string
     */
    public $fphm;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'xfsh'              => 'xfsh',
        'fpdm'              => 'fpdm',
        'fphm'              => 'fphm',
    ];

    public function validate()
    {
        Model::validateRequired('xfsh', $this->xfsh, true);
        Model::validateRequired('fpdm', $this->fpdm, true);
        Model::validateRequired('fphm', $this->fphm, true);
        Model::validateMaxLength('xfsh', $this->xfsh, 30);
        Model::validateMaxLength('fpdm', $this->fpdm, 100);
        Model::validateMaxLength('fphm', $this->fphm, 100);
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
        if (null !== $this->xfsh) {
            $res['xfsh'] = $this->xfsh;
        }
        if (null !== $this->fpdm) {
            $res['fpdm'] = $this->fpdm;
        }
        if (null !== $this->fphm) {
            $res['fphm'] = $this->fphm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeIcmInvoiceRequest
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
        if (isset($map['xfsh'])) {
            $model->xfsh = $map['xfsh'];
        }
        if (isset($map['fpdm'])) {
            $model->fpdm = $map['fpdm'];
        }
        if (isset($map['fphm'])) {
            $model->fphm = $map['fphm'];
        }

        return $model;
    }
}
