<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\DomainConfigVO;
use AntChain\DD\Models\BillingPlanVO;
use AntChain\DD\Models\RespackageConfVO;
use AntChain\DD\Models\ResPackageTemplateNewMeta;

class FeeConfEntityVO extends Model {
    protected $_name = [
        'domainConfigParam' => 'domain_config_param',
        'billingRuleMeta' => 'billing_rule_meta',
        'resPackageTemplateMeta' => 'res_package_template_meta',
        'resPackageTemplateNewMeta' => 'res_package_template_new_meta',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->domainConfigParam) {
            $res['domain_config_param'] = null !== $this->domainConfigParam ? $this->domainConfigParam->toMap() : null;
        }
        if (null !== $this->billingRuleMeta) {
            $res['billing_rule_meta'] = null !== $this->billingRuleMeta ? $this->billingRuleMeta->toMap() : null;
        }
        if (null !== $this->resPackageTemplateMeta) {
            $res['res_package_template_meta'] = [];
            if(null !== $this->resPackageTemplateMeta && is_array($this->resPackageTemplateMeta)){
                $n = 0;
                foreach($this->resPackageTemplateMeta as $item){
                    $res['res_package_template_meta'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resPackageTemplateNewMeta) {
            $res['res_package_template_new_meta'] = [];
            if(null !== $this->resPackageTemplateNewMeta && is_array($this->resPackageTemplateNewMeta)){
                $n = 0;
                foreach($this->resPackageTemplateNewMeta as $item){
                    $res['res_package_template_new_meta'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FeeConfEntityVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['domain_config_param'])){
            $model->domainConfigParam = DomainConfigVO::fromMap($map['domain_config_param']);
        }
        if(isset($map['billing_rule_meta'])){
            $model->billingRuleMeta = BillingPlanVO::fromMap($map['billing_rule_meta']);
        }
        if(isset($map['res_package_template_meta'])){
            if(!empty($map['res_package_template_meta'])){
                $model->resPackageTemplateMeta = [];
                $n = 0;
                foreach($map['res_package_template_meta'] as $item) {
                    $model->resPackageTemplateMeta[$n++] = null !== $item ? RespackageConfVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['res_package_template_new_meta'])){
            if(!empty($map['res_package_template_new_meta'])){
                $model->resPackageTemplateNewMeta = [];
                $n = 0;
                foreach($map['res_package_template_new_meta'] as $item) {
                    $model->resPackageTemplateNewMeta[$n++] = null !== $item ? ResPackageTemplateNewMeta::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 计量域配置信息
    /**
     * @example 
     * @var DomainConfigVO
     */
    public $domainConfigParam;

    // 计费计划配置
    /**
     * @example 
     * @var BillingPlanVO
     */
    public $billingRuleMeta;

    // 资源包配置
    /**
     * @example 
     * @var RespackageConfVO[]
     */
    public $resPackageTemplateMeta;

    // 新资源包模板
    /**
     * @example undefined
     * @var ResPackageTemplateNewMeta[]
     */
    public $resPackageTemplateNewMeta;

}
