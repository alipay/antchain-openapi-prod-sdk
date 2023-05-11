<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class AbilityInfo extends Model
{
    // 能力编号
    /**
     * @example ak_3821c8f0145440dab91b9b23edb1dc73
     *
     * @var string
     */
    public $abilityId;

    // 能力名称
    /**
     * @example B2B支付网关
     *
     * @var string
     */
    public $abilityName;

    // 研发负责人
    /**
     * @example 张三
     *
     * @var string
     */
    public $devOwner;

    // 创建时间
    /**
     * @example 2021-12-30 00:00:00
     *
     * @var string
     */
    public $gmtCreate;

    // 描述信息
    /**
     * @example 适用场景：企业资金支付场景   适合行业：存在企业采购/企业充值/企业转账等企业支付场景的行业   归属行业线：B类基础产品   产品描述：将交易场景与企业对公账户支付线上关联，订单交易对应的支付需求自动发送给企业网银做财务支出的确认和复核。
     *
     * @var string
     */
    public $description;

    // 研发负责人邮箱前缀
    /**
     * @example qiujianglong.qjl
     *
     * @var string
     */
    public $devOwnerPrefixEmail;

    // 产品负责人
    /**
     * @example 江来
     *
     * @var string
     */
    public $productOwner;

    // 能力对应商业中台L5Code
    /**
     * @example DMZNFM00883001
     *
     * @var string
     */
    public $businessCode;

    // apiInfoModels列表
    /**
     * @example test
     *
     * @var ApiInfoModel[]
     */
    public $apiInfoModels;
    protected $_name = [
        'abilityId'           => 'ability_id',
        'abilityName'         => 'ability_name',
        'devOwner'            => 'dev_owner',
        'gmtCreate'           => 'gmt_create',
        'description'         => 'description',
        'devOwnerPrefixEmail' => 'dev_owner_prefix_email',
        'productOwner'        => 'product_owner',
        'businessCode'        => 'business_code',
        'apiInfoModels'       => 'api_info_models',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
        Model::validateRequired('abilityName', $this->abilityName, true);
        Model::validateRequired('devOwner', $this->devOwner, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('devOwnerPrefixEmail', $this->devOwnerPrefixEmail, true);
        Model::validateRequired('productOwner', $this->productOwner, true);
        Model::validateRequired('apiInfoModels', $this->apiInfoModels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }
        if (null !== $this->abilityName) {
            $res['ability_name'] = $this->abilityName;
        }
        if (null !== $this->devOwner) {
            $res['dev_owner'] = $this->devOwner;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->devOwnerPrefixEmail) {
            $res['dev_owner_prefix_email'] = $this->devOwnerPrefixEmail;
        }
        if (null !== $this->productOwner) {
            $res['product_owner'] = $this->productOwner;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->apiInfoModels) {
            $res['api_info_models'] = [];
            if (null !== $this->apiInfoModels && \is_array($this->apiInfoModels)) {
                $n = 0;
                foreach ($this->apiInfoModels as $item) {
                    $res['api_info_models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AbilityInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }
        if (isset($map['ability_name'])) {
            $model->abilityName = $map['ability_name'];
        }
        if (isset($map['dev_owner'])) {
            $model->devOwner = $map['dev_owner'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['dev_owner_prefix_email'])) {
            $model->devOwnerPrefixEmail = $map['dev_owner_prefix_email'];
        }
        if (isset($map['product_owner'])) {
            $model->productOwner = $map['product_owner'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['api_info_models'])) {
            if (!empty($map['api_info_models'])) {
                $model->apiInfoModels = [];
                $n                    = 0;
                foreach ($map['api_info_models'] as $item) {
                    $model->apiInfoModels[$n++] = null !== $item ? ApiInfoModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
