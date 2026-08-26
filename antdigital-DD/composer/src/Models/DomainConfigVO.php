<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\DomainField;
use AntChain\DD\Models\PrimaryKeyGenRule;
use AntChain\DD\Models\DomainNode;
use AntChain\DD\Models\MeterDomainMember;
use AntChain\DD\Models\DomainSls;

class DomainConfigVO extends Model {
    protected $_name = [
        'operateType' => 'operate_type',
        'domainCode' => 'domain_code',
        'domainVersion' => 'domain_version',
        'chineseName' => 'chinese_name',
        'englishName' => 'english_name',
        'domainDesc' => 'domain_desc',
        'serviceCode' => 'service_code',
        'commodityCode' => 'commodity_code',
        'pushType' => 'push_type',
        'dimension' => 'dimension',
        'env' => 'env',
        'memo' => 'memo',
        'needAggregate' => 'need_aggregate',
        'creator' => 'creator',
        'modifier' => 'modifier',
        'domainFieldSet' => 'domain_field_set',
        'primaryKeyGenRule' => 'primary_key_gen_rule',
        'domainNodeSet' => 'domain_node_set',
        'meterDomainMemberSet' => 'meter_domain_member_set',
        'domainSls' => 'domain_sls',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->domainVersion) {
            $res['domain_version'] = $this->domainVersion;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->englishName) {
            $res['english_name'] = $this->englishName;
        }
        if (null !== $this->domainDesc) {
            $res['domain_desc'] = $this->domainDesc;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->pushType) {
            $res['push_type'] = $this->pushType;
        }
        if (null !== $this->dimension) {
            $res['dimension'] = $this->dimension;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->needAggregate) {
            $res['need_aggregate'] = $this->needAggregate;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->domainFieldSet) {
            $res['domain_field_set'] = [];
            if(null !== $this->domainFieldSet && is_array($this->domainFieldSet)){
                $n = 0;
                foreach($this->domainFieldSet as $item){
                    $res['domain_field_set'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->primaryKeyGenRule) {
            $res['primary_key_gen_rule'] = null !== $this->primaryKeyGenRule ? $this->primaryKeyGenRule->toMap() : null;
        }
        if (null !== $this->domainNodeSet) {
            $res['domain_node_set'] = [];
            if(null !== $this->domainNodeSet && is_array($this->domainNodeSet)){
                $n = 0;
                foreach($this->domainNodeSet as $item){
                    $res['domain_node_set'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->meterDomainMemberSet) {
            $res['meter_domain_member_set'] = [];
            if(null !== $this->meterDomainMemberSet && is_array($this->meterDomainMemberSet)){
                $n = 0;
                foreach($this->meterDomainMemberSet as $item){
                    $res['meter_domain_member_set'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->domainSls) {
            $res['domain_sls'] = null !== $this->domainSls ? $this->domainSls->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DomainConfigVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['operate_type'])){
            $model->operateType = $map['operate_type'];
        }
        if(isset($map['domain_code'])){
            $model->domainCode = $map['domain_code'];
        }
        if(isset($map['domain_version'])){
            $model->domainVersion = $map['domain_version'];
        }
        if(isset($map['chinese_name'])){
            $model->chineseName = $map['chinese_name'];
        }
        if(isset($map['english_name'])){
            $model->englishName = $map['english_name'];
        }
        if(isset($map['domain_desc'])){
            $model->domainDesc = $map['domain_desc'];
        }
        if(isset($map['service_code'])){
            $model->serviceCode = $map['service_code'];
        }
        if(isset($map['commodity_code'])){
            $model->commodityCode = $map['commodity_code'];
        }
        if(isset($map['push_type'])){
            $model->pushType = $map['push_type'];
        }
        if(isset($map['dimension'])){
            $model->dimension = $map['dimension'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['need_aggregate'])){
            $model->needAggregate = $map['need_aggregate'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['modifier'])){
            $model->modifier = $map['modifier'];
        }
        if(isset($map['domain_field_set'])){
            if(!empty($map['domain_field_set'])){
                $model->domainFieldSet = [];
                $n = 0;
                foreach($map['domain_field_set'] as $item) {
                    $model->domainFieldSet[$n++] = null !== $item ? DomainField::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['primary_key_gen_rule'])){
            $model->primaryKeyGenRule = PrimaryKeyGenRule::fromMap($map['primary_key_gen_rule']);
        }
        if(isset($map['domain_node_set'])){
            if(!empty($map['domain_node_set'])){
                $model->domainNodeSet = [];
                $n = 0;
                foreach($map['domain_node_set'] as $item) {
                    $model->domainNodeSet[$n++] = null !== $item ? DomainNode::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['meter_domain_member_set'])){
            if(!empty($map['meter_domain_member_set'])){
                $model->meterDomainMemberSet = [];
                $n = 0;
                foreach($map['meter_domain_member_set'] as $item) {
                    $model->meterDomainMemberSet[$n++] = null !== $item ? MeterDomainMember::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['domain_sls'])){
            $model->domainSls = DomainSls::fromMap($map['domain_sls']);
        }
        return $model;
    }
    // 操作类型
    /**
     * @example ADD
     * @var string
     */
    public $operateType;

    // 产品域Code，例如OSS
    /**
     * @example test_r
     * @var string
     */
    public $domainCode;

    // 版本
    /**
     * @example 2023#test_r
     * @var string
     */
    public $domainVersion;

    // 计量域中文名称
    /**
     * @example 中文名
     * @var string
     */
    public $chineseName;

    // 计量域英文名称
    /**
     * @example english_name
     * @var string
     */
    public $englishName;

    // 计量域描述
    /**
     * @example 计量域描述
     * @var string
     */
    public $domainDesc;

    // 渠道产品Code
    /**
     * @example serviceCode
     * @var string
     */
    public $serviceCode;

    // 商品code
    /**
     * @example 商品code
     * @var string
     */
    public $commodityCode;

    // 推送类型
    /**
     * @example 全量
     * @var string
     */
    public $pushType;

    // 计量数据维度
    /**
     * @example r
     * @var string
     */
    public $dimension;

    // 环境标识
    /**
     * @example prod
     * @var string
     */
    public $env;

    // 计量说明
    /**
     * @example 说明
     * @var string
     */
    public $memo;

    // domainCode是否需要聚合
    /**
     * @example N
     * @var string
     */
    public $needAggregate;

    // 创建者
    /**
     * @example 工号
     * @var string
     */
    public $creator;

    // 修改者
    /**
     * @example 工号
     * @var string
     */
    public $modifier;

    // 计量项list
    /**
     * @example 
     * @var DomainField[]
     */
    public $domainFieldSet;

    // 主键规则配置
    /**
     * @example 
     * @var PrimaryKeyGenRule
     */
    public $primaryKeyGenRule;

    // 计量节点
    /**
     * @example 
     * @var DomainNode[]
     */
    public $domainNodeSet;

    // 计量域成员信息
    /**
     * @example 
     * @var MeterDomainMember[]
     */
    public $meterDomainMemberSet;

    // DomainSLS配置
    /**
     * @example 
     * @var DomainSls
     */
    public $domainSls;

}
