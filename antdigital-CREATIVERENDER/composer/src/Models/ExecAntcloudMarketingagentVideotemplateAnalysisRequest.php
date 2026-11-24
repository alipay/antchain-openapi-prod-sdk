<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeVideoAssetRef;

class ExecAntcloudMarketingagentVideotemplateAnalysisRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'originVideo' => 'origin_video',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('originVideo', $this->originVideo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->originVideo) {
            $res['origin_video'] = null !== $this->originVideo ? $this->originVideo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentVideotemplateAnalysisRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['origin_video'])){
            $model->originVideo = CreativeVideoAssetRef::fromMap($map['origin_video']);
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 本次操作幂等键，最多64字符
    /**
     * @var string
     */
    public $requestId;

    // 原视频
    /**
     * @var CreativeVideoAssetRef
     */
    public $originVideo;

}
