<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class InitFaceauthZimRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 业务参数
    /**
     * @var string
     */
    public $bizData;

    // 渠道
    /**
     * @var string
     */
    public $channel;

    // 商户
    /**
     * @var string
     */
    public $merchant;

    // 环境参数
    /**
     * @var string
     */
    public $metaInfo;

    // 产品节点
    /**
     * @var string
     */
    public $produceNode;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 实人认证id
    /**
     * @var string
     */
    public $zimId;

    // 身份信息参数
    /**
     * @var string
     */
    public $zimPrincipal;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizData'           => 'biz_data',
        'channel'           => 'channel',
        'merchant'          => 'merchant',
        'metaInfo'          => 'meta_info',
        'produceNode'       => 'produce_node',
        'productName'       => 'product_name',
        'zimId'             => 'zim_id',
        'zimPrincipal'      => 'zim_principal',
    ];

    public function validate()
    {
        Model::validateRequired('metaInfo', $this->metaInfo, true);
        Model::validateRequired('zimId', $this->zimId, true);
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
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->merchant) {
            $res['merchant'] = $this->merchant;
        }
        if (null !== $this->metaInfo) {
            $res['meta_info'] = $this->metaInfo;
        }
        if (null !== $this->produceNode) {
            $res['produce_node'] = $this->produceNode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }
        if (null !== $this->zimPrincipal) {
            $res['zim_principal'] = $this->zimPrincipal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitFaceauthZimRequest
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
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['merchant'])) {
            $model->merchant = $map['merchant'];
        }
        if (isset($map['meta_info'])) {
            $model->metaInfo = $map['meta_info'];
        }
        if (isset($map['produce_node'])) {
            $model->produceNode = $map['produce_node'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }
        if (isset($map['zim_principal'])) {
            $model->zimPrincipal = $map['zim_principal'];
        }

        return $model;
    }
}
