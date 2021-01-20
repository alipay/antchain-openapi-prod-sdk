<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppServiceCount extends Model {
    protected $_name = [
        'classicCount' => 'classic_count',
        'containerCount' => 'container_count',
        'serverlessCount' => 'serverless_count',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->classicCount) {
            $res['classic_count'] = $this->classicCount;
        }
        if (null !== $this->containerCount) {
            $res['container_count'] = $this->containerCount;
        }
        if (null !== $this->serverlessCount) {
            $res['serverless_count'] = $this->serverlessCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceCount
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['classic_count'])){
            $model->classicCount = $map['classic_count'];
        }
        if(isset($map['container_count'])){
            $model->containerCount = $map['container_count'];
        }
        if(isset($map['serverless_count'])){
            $model->serverlessCount = $map['serverless_count'];
        }
        return $model;
    }
    // 经典容器服务数量
    /**
     * @example 
     * @var int
     */
    public $classicCount;

    // 容器应用服务数量
    /**
     * @example 
     * @var int
     */
    public $containerCount;

    // 无服务器应用服务数
    /**
     * @example 
     * @var int
     */
    public $serverlessCount;

}
