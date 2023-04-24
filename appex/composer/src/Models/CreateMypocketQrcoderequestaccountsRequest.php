<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateMypocketQrcoderequestaccountsRequest extends Model
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

    // 外部业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 应用唯一标识
    /**
     * @var string
     */
    public $appId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 账户类型，枚举值，  MYCHAIN|ETH
    /**
     * @var string
     */
    public $accountType;

    // 小程序码颜色，枚举，  ALIPAY_BLUE|BLACK|WHITE
    /**
     * @var string
     */
    public $color;

    // 小程序码大小，枚举，SMALL|MEDIUM|LARGE
    /**
     * @var string
     */
    public $size;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outBizNo'          => 'out_biz_no',
        'appId'             => 'app_id',
        'chainId'           => 'chain_id',
        'accountType'       => 'account_type',
        'color'             => 'color',
        'size'              => 'size',
    ];

    public function validate()
    {
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateMaxLength('outBizNo', $this->outBizNo, 64);
        Model::validateMaxLength('chainId', $this->chainId, 64);
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMypocketQrcoderequestaccountsRequest
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
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }

        return $model;
    }
}
