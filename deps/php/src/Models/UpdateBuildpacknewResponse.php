<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\UploadEndpoint;

class UpdateBuildpacknewResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'buildpackId' => 'buildpack_id',
        'uploadEndpoints' => 'upload_endpoints',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->uploadEndpoints) {
            $res['upload_endpoints'] = [];
            if(null !== $this->uploadEndpoints && is_array($this->uploadEndpoints)){
                $n = 0;
                foreach($this->uploadEndpoints as $item){
                    $res['upload_endpoints'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBuildpacknewResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['upload_endpoints'])){
            if(!empty($map['upload_endpoints'])){
                $model->uploadEndpoints = [];
                $n = 0;
                foreach($map['upload_endpoints'] as $item) {
                    $model->uploadEndpoints[$n++] = null !== $item ? UploadEndpoint::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // buildpack_id
    /**
     * @var string
     */
    public $buildpackId;

    // upload_endpoints
    /**
     * @var UploadEndpoint[]
     */
    public $uploadEndpoints;

}
