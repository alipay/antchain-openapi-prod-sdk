<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationPackageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'appName' => 'app_name',
        'creationTime' => 'creation_time',
        'downloadUrl' => 'download_url',
        'etag' => 'etag',
        'name' => 'name',
        'versionMemo' => 'version_memo',
        'versionNo' => 'version_no',
        'workspace' => 'workspace',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->etag) {
            $res['etag'] = $this->etag;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->versionMemo) {
            $res['version_memo'] = $this->versionMemo;
        }
        if (null !== $this->versionNo) {
            $res['version_no'] = $this->versionNo;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetApplicationPackageResponse
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
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['download_url'])){
            $model->downloadUrl = $map['download_url'];
        }
        if(isset($map['etag'])){
            $model->etag = $map['etag'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['version_memo'])){
            $model->versionMemo = $map['version_memo'];
        }
        if(isset($map['version_no'])){
            $model->versionNo = $map['version_no'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
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

    // 应用发布包所属应用名字
    /**
     * @var string
     */
    public $appName;

    // 应用发布包创建时间
    /**
     * @var string
     */
    public $creationTime;

    // 应用发布包下载地址
    /**
     * @var string
     */
    public $downloadUrl;

    // 应用发布包的校验码
    /**
     * @var string
     */
    public $etag;

    // 应用发布包名称
    /**
     * @var string
     */
    public $name;

    // 应用发布包备注
    /**
     * @var string
     */
    public $versionMemo;

    // 应用发布包版本
    /**
     * @var string
     */
    public $versionNo;

    // 应用发布包所属环境
    /**
     * @var string
     */
    public $workspace;

}
