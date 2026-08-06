<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignField extends Model {
    protected $_name = [
        'accountId' => 'account_id',
        'fileId' => 'file_id',
        'signfieldId' => 'signfield_id',
    ];
    public function validate() {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('signfieldId', $this->signfieldId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->signfieldId) {
            $res['signfield_id'] = $this->signfieldId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractSignField
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['signfield_id'])){
            $model->signfieldId = $map['signfield_id'];
        }
        return $model;
    }
    // 电子合同用户ID
    /**
     * @example faea8237c61a4fdea864ee8d7621e14f
     * @var string
     */
    public $accountId;

    // 电子合同文档ID
    /**
     * @example fe7df2f477d649c18ebcfdfffeba253d
     * @var string
     */
    public $fileId;

    // 电子合同签署区id
    /**
     * @example b76b69d5b48d4f689cae997e42809ac4
     * @var string
     */
    public $signfieldId;

}
