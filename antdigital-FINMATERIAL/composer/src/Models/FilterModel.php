<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class FilterModel extends Model {
    protected $_name = [
        'includeDomains' => 'include_domains',
        'excludeDomains' => 'exclude_domains',
        'timeRange' => 'time_range',
        'needUrl' => 'need_url',
        'industry' => 'industry',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->includeDomains) {
            $res['include_domains'] = $this->includeDomains;
        }
        if (null !== $this->excludeDomains) {
            $res['exclude_domains'] = $this->excludeDomains;
        }
        if (null !== $this->timeRange) {
            $res['time_range'] = $this->timeRange;
        }
        if (null !== $this->needUrl) {
            $res['need_url'] = $this->needUrl;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FilterModel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['include_domains'])){
            if(!empty($map['include_domains'])){
                $model->includeDomains = $map['include_domains'];
            }
        }
        if(isset($map['exclude_domains'])){
            if(!empty($map['exclude_domains'])){
                $model->excludeDomains = $map['exclude_domains'];
            }
        }
        if(isset($map['time_range'])){
            $model->timeRange = $map['time_range'];
        }
        if(isset($map['need_url'])){
            $model->needUrl = $map['need_url'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        return $model;
    }
    // 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
    /**
     * @example ["gov.cn"]
     * @var string[]
     */
    public $includeDomains;

    // 排除指定网站；填写域名，不包含协议和路径
    /**
     * @example undefined
     * @var string[]
     */
    public $excludeDomains;

    // 预留。计划用于按发布时间筛选，当前不生效
    /**
     * @example -
     * @var string
     */
    public $timeRange;

    // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
    /**
     * @example true
     * @var bool
     */
    public $needUrl;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    /**
     * @example -
     * @var string
     */
    public $industry;

}
