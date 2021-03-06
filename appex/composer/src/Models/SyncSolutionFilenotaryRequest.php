<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class SyncSolutionFilenotaryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应用did
    //
    /**
     * @var string
     */
    public $appDid;

    // 文件存证id
    //
    /**
     * @var string
     */
    public $fileNotaryId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appDid'            => 'app_did',
        'fileNotaryId'      => 'file_notary_id',
    ];

    public function validate()
    {
        Model::validateRequired('appDid', $this->appDid, true);
        Model::validateRequired('fileNotaryId', $this->fileNotaryId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appDid) {
            $res['app_did'] = $this->appDid;
        }
        if (null !== $this->fileNotaryId) {
            $res['file_notary_id'] = $this->fileNotaryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncSolutionFilenotaryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['app_did'])) {
            $model->appDid = $map['app_did'];
        }
        if (isset($map['file_notary_id'])) {
            $model->fileNotaryId = $map['file_notary_id'];
        }

        return $model;
    }
}
