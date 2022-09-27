<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class GwVerifyScene extends Model
{
    // 调用方系统名
    /**
     * @example appname
     *
     * @var string
     */
    public $systemName;

    // 业务方产品
    /**
     * @example product
     *
     * @var string
     */
    public $bizProduct;

    // 业务产品节点
    /**
     * @example node
     *
     * @var string
     */
    public $bizProdNode;

    // 业务接入渠道
    /**
     * @example web
     *
     * @var string
     */
    public $accessChannel;

    // 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
    /**
     * @example chi
     *
     * @var string
     */
    public $language;
    protected $_name = [
        'systemName'    => 'system_name',
        'bizProduct'    => 'biz_product',
        'bizProdNode'   => 'biz_prod_node',
        'accessChannel' => 'access_channel',
        'language'      => 'language',
    ];

    public function validate()
    {
        Model::validateRequired('systemName', $this->systemName, true);
        Model::validateRequired('bizProduct', $this->bizProduct, true);
        Model::validateRequired('bizProdNode', $this->bizProdNode, true);
        Model::validateRequired('accessChannel', $this->accessChannel, true);
        Model::validateRequired('language', $this->language, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->systemName) {
            $res['system_name'] = $this->systemName;
        }
        if (null !== $this->bizProduct) {
            $res['biz_product'] = $this->bizProduct;
        }
        if (null !== $this->bizProdNode) {
            $res['biz_prod_node'] = $this->bizProdNode;
        }
        if (null !== $this->accessChannel) {
            $res['access_channel'] = $this->accessChannel;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GwVerifyScene
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['system_name'])) {
            $model->systemName = $map['system_name'];
        }
        if (isset($map['biz_product'])) {
            $model->bizProduct = $map['biz_product'];
        }
        if (isset($map['biz_prod_node'])) {
            $model->bizProdNode = $map['biz_prod_node'];
        }
        if (isset($map['access_channel'])) {
            $model->accessChannel = $map['access_channel'];
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }

        return $model;
    }
}
