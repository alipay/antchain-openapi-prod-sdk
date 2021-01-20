<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarReleaseVersion;

class ListSidecarVersionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sidecarReleaseVersions' => 'sidecar_release_versions',
        'totalCount' => 'total_count',
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
        if (null !== $this->sidecarReleaseVersions) {
            $res['sidecar_release_versions'] = [];
            if(null !== $this->sidecarReleaseVersions && is_array($this->sidecarReleaseVersions)){
                $n = 0;
                foreach($this->sidecarReleaseVersions as $item){
                    $res['sidecar_release_versions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListSidecarVersionResponse
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
        if(isset($map['sidecar_release_versions'])){
            if(!empty($map['sidecar_release_versions'])){
                $model->sidecarReleaseVersions = [];
                $n = 0;
                foreach($map['sidecar_release_versions'] as $item) {
                    $model->sidecarReleaseVersions[$n++] = null !== $item ? SidecarReleaseVersion::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
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

    // sidecar发布版本列表
    /**
     * @var SidecarReleaseVersion[]
     */
    public $sidecarReleaseVersions;

    // 总记录条数
    /**
     * @var int
     */
    public $totalCount;

}
