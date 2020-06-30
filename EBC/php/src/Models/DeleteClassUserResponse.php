<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\OrgUser;

class DeleteClassUserResponse extends Model {
    protected $_name = [
        'failList' => 'fail_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->failList) {
            $res['fail_list'] = [];
            if(null !== $this->failList && is_array($this->failList)){
                $n = 0;
                foreach($this->failList as $item){
                    $res['fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteClassUserResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['fail_list'])){
            if(!empty($map['fail_list'])){
                $model->failList = [];
                $n = 0;
                foreach($map['fail_list'] as $item) {
                    $model->failList[$n++] = null !== $item ? OrgUser::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 删除失败的用户列表
     * @example 
     * @var array
     */
    public $failList;

}
