<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractTemplateResp extends Model
{
    // 模板标识
    /**
     * @example tme202307251209228357cc
     *
     * @var string
     */
    public $templateId;

    // 产品码
    /**
     * @example 0001
     *
     * @var string
     */
    public $productCode;

    // 合约名称
    /**
     * @example 资产合约
     *
     * @var string
     */
    public $name;

    // 缩略图url
    /**
     * @example http://www.xxx.com
     *
     * @var string
     */
    public $thumbUrl;

    // 合约描述
    /**
     * @example 实现数据不可删除，不可篡改，不可抵赖的存证效果
     *
     * @var string
     */
    public $description;

    // 文档地址
    /**
     * @example https://help.aliyun.com/product/84950.html
     *
     * @var string
     */
    public $detailUrl;

    // 是否已开通合约
    /**
     * @example true
     *
     * @var bool
     */
    public $open;

    // 后续展示：购买用户头像
    /**
     * @example
     *
     * @var string[]
     */
    public $avatarLogoList;

    // 定制合约价格
    /**
     * @example 定制合约服务费用：80,000元/年
     *
     * @var string
     */
    public $priceMessage;
    protected $_name = [
        'templateId'     => 'template_id',
        'productCode'    => 'product_code',
        'name'           => 'name',
        'thumbUrl'       => 'thumb_url',
        'description'    => 'description',
        'detailUrl'      => 'detail_url',
        'open'           => 'open',
        'avatarLogoList' => 'avatar_logo_list',
        'priceMessage'   => 'price_message',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->thumbUrl) {
            $res['thumb_url'] = $this->thumbUrl;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->detailUrl) {
            $res['detail_url'] = $this->detailUrl;
        }
        if (null !== $this->open) {
            $res['open'] = $this->open;
        }
        if (null !== $this->avatarLogoList) {
            $res['avatar_logo_list'] = $this->avatarLogoList;
        }
        if (null !== $this->priceMessage) {
            $res['price_message'] = $this->priceMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractTemplateResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['thumb_url'])) {
            $model->thumbUrl = $map['thumb_url'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['detail_url'])) {
            $model->detailUrl = $map['detail_url'];
        }
        if (isset($map['open'])) {
            $model->open = $map['open'];
        }
        if (isset($map['avatar_logo_list'])) {
            if (!empty($map['avatar_logo_list'])) {
                $model->avatarLogoList = $map['avatar_logo_list'];
            }
        }
        if (isset($map['price_message'])) {
            $model->priceMessage = $map['price_message'];
        }

        return $model;
    }
}
