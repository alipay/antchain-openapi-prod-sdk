<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OTAModuleResponse extends Model {
    protected $_name = [
        'id' => 'id',
        'tenantId' => 'tenant_id',
        'trustProductKey' => 'trust_product_key',
        'productName' => 'product_name',
        'moduleName' => 'module_name',
        'aliasName' => 'alias_name',
        'description' => 'description',
        'mid' => 'mid',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->mid) {
            $res['mid'] = $this->mid;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OTAModuleResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['alias_name'])){
            $model->aliasName = $map['alias_name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['mid'])){
            $model->mid = $map['mid'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        return $model;
    }
    // 主键id
    /**
     * @example 636804107650338816
     * @var string
     */
    public $id;

    // 租户id
    /**
     * @example POPVPRVV
     * @var string
     */
    public $tenantId;

    // 可信物联唯一产品标识
    /**
     * @example B7uwSpw2dAaxhZ8nJt
     * @var string
     */
    public $trustProductKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // 模块名称
    /**
     * @example CAT1_OTA
     * @var string
     */
    public $moduleName;

    // 模块别名
    /**
     * @example 模块别名
     * @var string
     */
    public $aliasName;

    // 模块描述
    /**
     * @example 模块描述
     * @var string
     */
    public $description;

    // KYT模块唯一标识
    /**
     * @example 2bace9c5bdd54b2781a5d325055ada57
     * @var string
     */
    public $mid;

    // 创建时间
    /**
     * @example 1773998631000
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 1773998631000
     * @var string
     */
    public $gmtModified;

}
