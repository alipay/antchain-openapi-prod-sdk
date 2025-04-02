<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SecurityScene extends Model
{
    // 接入渠道
    /**
     * @example web
     *
     * @var string
     */
    public $accessChannel;

    // 事件信息
    /**
     * @example
     *
     * @var string
     */
    public $ctuParams;

    // 产品名称
    /**
     * @example mobile_cashier
     *
     * @var string
     */
    public $productName;

    // 产品节点
    /**
     * @example code
     *
     * @var string
     */
    public $productNode;

    // 扩展参数
    /**
     * @example 1234
     *
     * @var string
     */
    public $securitySceneParams;

    // 系统名称
    /**
     * @example mobilecashier
     *
     * @var string
     */
    public $systemName;

    // 总金额
    /**
     * @example 10.0
     *
     * @var string
     */
    public $totalFee;
    protected $_name = [
        'accessChannel'       => 'access_channel',
        'ctuParams'           => 'ctu_params',
        'productName'         => 'product_name',
        'productNode'         => 'product_node',
        'securitySceneParams' => 'security_scene_params',
        'systemName'          => 'system_name',
        'totalFee'            => 'total_fee',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessChannel) {
            $res['access_channel'] = $this->accessChannel;
        }
        if (null !== $this->ctuParams) {
            $res['ctu_params'] = $this->ctuParams;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productNode) {
            $res['product_node'] = $this->productNode;
        }
        if (null !== $this->securitySceneParams) {
            $res['security_scene_params'] = $this->securitySceneParams;
        }
        if (null !== $this->systemName) {
            $res['system_name'] = $this->systemName;
        }
        if (null !== $this->totalFee) {
            $res['total_fee'] = $this->totalFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityScene
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_channel'])) {
            $model->accessChannel = $map['access_channel'];
        }
        if (isset($map['ctu_params'])) {
            $model->ctuParams = $map['ctu_params'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_node'])) {
            $model->productNode = $map['product_node'];
        }
        if (isset($map['security_scene_params'])) {
            $model->securitySceneParams = $map['security_scene_params'];
        }
        if (isset($map['system_name'])) {
            $model->systemName = $map['system_name'];
        }
        if (isset($map['total_fee'])) {
            $model->totalFee = $map['total_fee'];
        }

        return $model;
    }
}
