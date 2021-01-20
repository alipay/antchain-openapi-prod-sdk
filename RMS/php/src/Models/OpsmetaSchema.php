<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\OpsFilter;

class OpsmetaSchema extends Model {
    protected $_name = [
        'envs' => 'envs',
        'idc' => 'idc',
        'ldc' => 'ldc',
        'server' => 'server',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->envs) {
            $res['envs'] = $this->envs;
        }
        if (null !== $this->idc) {
            $res['idc'] = null !== $this->idc ? $this->idc->toMap() : null;
        }
        if (null !== $this->ldc) {
            $res['ldc'] = null !== $this->ldc ? $this->ldc->toMap() : null;
        }
        if (null !== $this->server) {
            $res['server'] = null !== $this->server ? $this->server->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsmetaSchema
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['envs'])){
            if(!empty($map['envs'])){
                $model->envs = $map['envs'];
            }
        }
        if(isset($map['idc'])){
            $model->idc = OpsFilter::fromMap($map['idc']);
        }
        if(isset($map['ldc'])){
            $model->ldc = OpsFilter::fromMap($map['ldc']);
        }
        if(isset($map['server'])){
            $model->server = OpsFilter::fromMap($map['server']);
        }
        return $model;
    }
    // envs
    /**
     * @example envs
     * @var string[]
     */
    public $envs;

    // idc
    /**
     * @example idc
     * @var OpsFilter
     */
    public $idc;

    // ldc
    /**
     * @example ldc
     * @var OpsFilter
     */
    public $ldc;

    // server
    /**
     * @example server
     * @var OpsFilter
     */
    public $server;

}
