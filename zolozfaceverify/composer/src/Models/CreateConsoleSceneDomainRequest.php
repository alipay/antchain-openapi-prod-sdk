<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class CreateConsoleSceneDomainRequest extends Model
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

    // 场景id
    /**
     * @var string
     */
    public $sceneId;

    // 用于排查问题
    /**
     * @var string
     */
    public $bizId;

    // 客户填自己需要绑定的小程序名称
    /**
     * @var string
     */
    public $miniProgramName;

    // 所属平台，微信、支付宝
    /**
     * @var string
     */
    public $platform;

    // 校验文件的名称
    /**
     * @var string
     */
    public $checkFileName;

    // 填校验文件里面的内容
    /**
     * @var string
     */
    public $checkFileBody;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneId'           => 'scene_id',
        'bizId'             => 'biz_id',
        'miniProgramName'   => 'mini_program_name',
        'platform'          => 'platform',
        'checkFileName'     => 'check_file_name',
        'checkFileBody'     => 'check_file_body',
    ];

    public function validate()
    {
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('miniProgramName', $this->miniProgramName, true);
        Model::validateRequired('platform', $this->platform, true);
        Model::validateRequired('checkFileName', $this->checkFileName, true);
        Model::validateRequired('checkFileBody', $this->checkFileBody, true);
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
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->miniProgramName) {
            $res['mini_program_name'] = $this->miniProgramName;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->checkFileName) {
            $res['check_file_name'] = $this->checkFileName;
        }
        if (null !== $this->checkFileBody) {
            $res['check_file_body'] = $this->checkFileBody;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsoleSceneDomainRequest
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
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['mini_program_name'])) {
            $model->miniProgramName = $map['mini_program_name'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['check_file_name'])) {
            $model->checkFileName = $map['check_file_name'];
        }
        if (isset($map['check_file_body'])) {
            $model->checkFileBody = $map['check_file_body'];
        }

        return $model;
    }
}
