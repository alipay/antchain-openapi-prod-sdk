<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CommoditySyncCommonBuyInfo extends Model
{
    // 商品列表配置 ListJson字符串
    /**
     * @example {"cyCode":"KXSFFM00329522","cyCodeType":"L5","description":"","gmtCreate":1768268723555,"gmtModified":1768268723555,"h5Mage":"","id":0,"pcImage":"","relateOu":"ZL6","relateSaleCode":"KXSFFSZL600314529","relateSaleName":"企业版"}
     *
     * @var string[]
     */
    public $commonBuySaleGroupListJson;

    // 规格配置 ListJson字符串
    /**
     * @example {"attrCode":"L0735","id":4459268,"offerCode":"DJKXFM01233589"}
     *
     * @var string[]
     */
    public $offerAttrListJson;

    // Region配置 ListJson字符串
    /**
     * @example {"aliyunRegionCode":"","id":1,"instCode":"","regionCode":"","regionName":"","type":"","zoneRange":""}
     *
     * @var string[]
     */
    public $prodOfferRegionListJson;

    // 费用项配置 ListJson字符串
    /**
     * @example {"attrGroupCode":"","attrGroupName":"","attrGroupType":"","feeExpress":"","feeExpressMap":{},"feeList":[{"attrGroupCode":"","attrGroupName":"","fee":"","feeAttr":"","feeId":0,"id":0,"remark":""}],"id":0,"offerCode":"","remark":""}
     *
     * @var string[]
     */
    public $offerAttrGroupListJson;

    // 属性配置 ListJson字符串
    /**
     * @example {"attrCode":"","defaultValue":"","displayName":"","express":"","id":0,"offerCode":"","offerVersion":"","remark":"","tip":"","valueRange":""}
     *
     * @var string[]
     */
    public $offerExtendAttrListJson;

    // 界面归类配置 ListJson字符串
    /**
     * @example {"displayName":"","groupCode":"","id":1,"memberList":[{"buyDisplay":"","componentCode":"","displayType":"","groupId":0,"id":0,"label":"","labelDisplay":"","required":"","sortId":0,"upgradeDisplay":""}],"offerCode":"","remark":"","seqOrder":1}
     *
     * @var string[]
     */
    public $offerCommonBuyGroupListJson;

    // 规格约束配置 ListJson字符串
    /**
     * @example {"cond":"","condType":"","constraintName":"","id":0,"offerCode":"","offerUniqueVid":"","orderType":"","remark":"","result":""}
     *
     * @var string[]
     */
    public $offerAttrConstraintsListFson;

    // 售卖规则配置 ListJson字符串
    /**
     * @example {"actionParam":"","groupIndex":0,"groupName":"","id":0,"memberList":[{"groupId":0,"id":0,"isNegative":false,"onlyLogin":"","paramStr":"","ruleCode":"","ruleIndex":0,"ruleScript":"","ruleType":""}],"remark":"","ruleEventCode":""}
     *
     * @var string[]
     */
    public $offerRuleGroupListJson;
    protected $_name = [
        'commonBuySaleGroupListJson'   => 'common_buy_sale_group_list_json',
        'offerAttrListJson'            => 'offer_attr_list_json',
        'prodOfferRegionListJson'      => 'prod_offer_region_list_json',
        'offerAttrGroupListJson'       => 'offer_attr_group_list_json',
        'offerExtendAttrListJson'      => 'offer_extend_attr_list_json',
        'offerCommonBuyGroupListJson'  => 'offer_common_buy_group_list_json',
        'offerAttrConstraintsListFson' => 'offer_attr_constraints_list_fson',
        'offerRuleGroupListJson'       => 'offer_rule_group_list_json',
    ];

    public function validate()
    {
        Model::validateRequired('commonBuySaleGroupListJson', $this->commonBuySaleGroupListJson, true);
        Model::validateRequired('offerAttrListJson', $this->offerAttrListJson, true);
        Model::validateRequired('prodOfferRegionListJson', $this->prodOfferRegionListJson, true);
        Model::validateRequired('offerAttrGroupListJson', $this->offerAttrGroupListJson, true);
        Model::validateRequired('offerExtendAttrListJson', $this->offerExtendAttrListJson, true);
        Model::validateRequired('offerCommonBuyGroupListJson', $this->offerCommonBuyGroupListJson, true);
        Model::validateRequired('offerAttrConstraintsListFson', $this->offerAttrConstraintsListFson, true);
        Model::validateRequired('offerRuleGroupListJson', $this->offerRuleGroupListJson, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commonBuySaleGroupListJson) {
            $res['common_buy_sale_group_list_json'] = $this->commonBuySaleGroupListJson;
        }
        if (null !== $this->offerAttrListJson) {
            $res['offer_attr_list_json'] = $this->offerAttrListJson;
        }
        if (null !== $this->prodOfferRegionListJson) {
            $res['prod_offer_region_list_json'] = $this->prodOfferRegionListJson;
        }
        if (null !== $this->offerAttrGroupListJson) {
            $res['offer_attr_group_list_json'] = $this->offerAttrGroupListJson;
        }
        if (null !== $this->offerExtendAttrListJson) {
            $res['offer_extend_attr_list_json'] = $this->offerExtendAttrListJson;
        }
        if (null !== $this->offerCommonBuyGroupListJson) {
            $res['offer_common_buy_group_list_json'] = $this->offerCommonBuyGroupListJson;
        }
        if (null !== $this->offerAttrConstraintsListFson) {
            $res['offer_attr_constraints_list_fson'] = $this->offerAttrConstraintsListFson;
        }
        if (null !== $this->offerRuleGroupListJson) {
            $res['offer_rule_group_list_json'] = $this->offerRuleGroupListJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommoditySyncCommonBuyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['common_buy_sale_group_list_json'])) {
            if (!empty($map['common_buy_sale_group_list_json'])) {
                $model->commonBuySaleGroupListJson = $map['common_buy_sale_group_list_json'];
            }
        }
        if (isset($map['offer_attr_list_json'])) {
            if (!empty($map['offer_attr_list_json'])) {
                $model->offerAttrListJson = $map['offer_attr_list_json'];
            }
        }
        if (isset($map['prod_offer_region_list_json'])) {
            if (!empty($map['prod_offer_region_list_json'])) {
                $model->prodOfferRegionListJson = $map['prod_offer_region_list_json'];
            }
        }
        if (isset($map['offer_attr_group_list_json'])) {
            if (!empty($map['offer_attr_group_list_json'])) {
                $model->offerAttrGroupListJson = $map['offer_attr_group_list_json'];
            }
        }
        if (isset($map['offer_extend_attr_list_json'])) {
            if (!empty($map['offer_extend_attr_list_json'])) {
                $model->offerExtendAttrListJson = $map['offer_extend_attr_list_json'];
            }
        }
        if (isset($map['offer_common_buy_group_list_json'])) {
            if (!empty($map['offer_common_buy_group_list_json'])) {
                $model->offerCommonBuyGroupListJson = $map['offer_common_buy_group_list_json'];
            }
        }
        if (isset($map['offer_attr_constraints_list_fson'])) {
            if (!empty($map['offer_attr_constraints_list_fson'])) {
                $model->offerAttrConstraintsListFson = $map['offer_attr_constraints_list_fson'];
            }
        }
        if (isset($map['offer_rule_group_list_json'])) {
            if (!empty($map['offer_rule_group_list_json'])) {
                $model->offerRuleGroupListJson = $map['offer_rule_group_list_json'];
            }
        }

        return $model;
    }
}
