<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ErrorRealte extends Model {
    protected $_name = [
        'ips' => 'ips',
        'logPaths' => 'log_paths',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }
        if (null !== $this->logPaths) {
            $res['log_paths'] = $this->logPaths;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ErrorRealte
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ips'])){
            if(!empty($map['ips'])){
                $model->ips = $map['ips'];
            }
        }
        if(isset($map['log_paths'])){
            if(!empty($map['log_paths'])){
                $model->logPaths = $map['log_paths'];
            }
        }
        return $model;
    }
    // ips
    /**
     * @example ips
     * @var string[]
     */
    public $ips;

    // log_paths
    /**
     * @example log_paths
     * @var string[]
     */
    public $logPaths;

}
