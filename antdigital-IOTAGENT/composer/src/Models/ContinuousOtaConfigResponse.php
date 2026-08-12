<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\ContinuousOtaOpenApiPolicyResponse;

class ContinuousOtaConfigResponse extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'tenantName' => 'tenant_name',
        'enabled' => 'enabled',
        'dedupExpireMinutes' => 'dedup_expire_minutes',
        'lockVersion' => 'lock_version',
        'productConfigs' => 'product_configs',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->dedupExpireMinutes) {
            $res['dedup_expire_minutes'] = $this->dedupExpireMinutes;
        }
        if (null !== $this->lockVersion) {
            $res['lock_version'] = $this->lockVersion;
        }
        if (null !== $this->productConfigs) {
            $res['product_configs'] = [];
            if(null !== $this->productConfigs && is_array($this->productConfigs)){
                $n = 0;
                foreach($this->productConfigs as $item){
                    $res['product_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContinuousOtaConfigResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['enabled'])){
            $model->enabled = $map['enabled'];
        }
        if(isset($map['dedup_expire_minutes'])){
            $model->dedupExpireMinutes = $map['dedup_expire_minutes'];
        }
        if(isset($map['lock_version'])){
            $model->lockVersion = $map['lock_version'];
        }
        if(isset($map['product_configs'])){
            if(!empty($map['product_configs'])){
                $model->productConfigs = [];
                $n = 0;
                foreach($map['product_configs'] as $item) {
                    $model->productConfigs[$n++] = null !== $item ? ContinuousOtaOpenApiPolicyResponse::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 当前配置所属租户 ID
    /**
     * @example XQBKTRQV
     * @var string
     */
    public $tenantId;

    // 租户名称；跨租户管理视图中可能为空
    /**
     * @example 租户名称
     * @var string
     */
    public $tenantName;

    // 租户级连续推送总开关
    /**
     * @example true
     * @var bool
     */
    public $enabled;

    // 同设备同固件的去重窗口，单位分钟
    /**
     * @example 1
     * @var int
     */
    public $dedupExpireMinutes;

    // 租户级设置锁版本，以字符串返回，更新设置时作为 expectedLockVersion 回传
    /**
     * @example 1
     * @var string
     */
    public $lockVersion;

    // 产品策略列表
    /**
     * @example undefined
     * @var ContinuousOtaOpenApiPolicyResponse[]
     */
    public $productConfigs;

}
