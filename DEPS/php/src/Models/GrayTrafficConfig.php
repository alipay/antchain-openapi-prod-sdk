<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GrayTrafficConfig extends Model {
    protected $_name = [
        'grayTrafficType' => 'gray_traffic_type',
        'hostname' => 'hostname',
        'matchPatterns' => 'match_patterns',
        'port' => 'port',
        'proportion' => 'proportion',
        'targetUri' => 'target_uri',
    ];
    public function validate() {
        Model::validateRequired('grayTrafficType', $this->grayTrafficType, true);
        Model::validateRequired('hostname', $this->hostname, true);
        Model::validateRequired('matchPatterns', $this->matchPatterns, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('proportion', $this->proportion, true);
        Model::validateRequired('targetUri', $this->targetUri, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->grayTrafficType) {
            $res['gray_traffic_type'] = $this->grayTrafficType;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->matchPatterns) {
            $res['match_patterns'] = $this->matchPatterns;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->proportion) {
            $res['proportion'] = $this->proportion;
        }
        if (null !== $this->targetUri) {
            $res['target_uri'] = $this->targetUri;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GrayTrafficConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['gray_traffic_type'])){
            $model->grayTrafficType = $map['gray_traffic_type'];
        }
        if(isset($map['hostname'])){
            $model->hostname = $map['hostname'];
        }
        if(isset($map['match_patterns'])){
            $model->matchPatterns = $map['match_patterns'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
        }
        if(isset($map['proportion'])){
            $model->proportion = $map['proportion'];
        }
        if(isset($map['target_uri'])){
            $model->targetUri = $map['target_uri'];
        }
        return $model;
    }
    // 灰度流量类型
    /**
     * @example COOKIE
     * @var string
     */
    public $grayTrafficType;

    // 主机名
    /**
     * @example test
     * @var string
     */
    public $hostname;

    // 匹配规则
    /**
     * @example ss
     * @var string
     */
    public $matchPatterns;

    // 端口号
    /**
     * @example 80
     * @var int
     */
    public $port;

    // 比例
    /**
     * @example 10
     * @var string
     */
    public $proportion;

    // 目标 uri
    /**
     * @example test-uri
     * @var string
     */
    public $targetUri;

}
