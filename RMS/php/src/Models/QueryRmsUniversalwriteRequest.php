<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\UniversalBodyCmd;

class QueryRmsUniversalwriteRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'cmds' => 'cmds',
        'rid' => 'rid',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cmds) {
            $res['cmds'] = [];
            if(null !== $this->cmds && is_array($this->cmds)){
                $n = 0;
                foreach($this->cmds as $item){
                    $res['cmds'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rid) {
            $res['rid'] = $this->rid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRmsUniversalwriteRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['cmds'])){
            if(!empty($map['cmds'])){
                $model->cmds = [];
                $n = 0;
                foreach($map['cmds'] as $item) {
                    $model->cmds[$n++] = null !== $item ? UniversalBodyCmd::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['rid'])){
            $model->rid = $map['rid'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // cmds
    /**
     * @var UniversalBodyCmd[]
     */
    public $cmds;

    // rid
    /**
     * @var string
     */
    public $rid;

}
