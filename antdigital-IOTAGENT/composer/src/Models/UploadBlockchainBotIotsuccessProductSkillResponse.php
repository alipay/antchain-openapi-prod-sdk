<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiSkillInfo;

class UploadBlockchainBotIotsuccessProductSkillResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'pluginId' => 'plugin_id',
        'fileName' => 'file_name',
        'revision' => 'revision',
        'skillCount' => 'skill_count',
        'skills' => 'skills',
    ];
    public function validate() {
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validateRequired('skillCount', $this->skillCount, true);
        Model::validateRequired('skills', $this->skills, true);
    }
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
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->skillCount) {
            $res['skill_count'] = $this->skillCount;
        }
        if (null !== $this->skills) {
            $res['skills'] = [];
            if(null !== $this->skills && is_array($this->skills)){
                $n = 0;
                foreach($this->skills as $item){
                    $res['skills'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadBlockchainBotIotsuccessProductSkillResponse
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
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['revision'])){
            $model->revision = $map['revision'];
        }
        if(isset($map['skill_count'])){
            $model->skillCount = $map['skill_count'];
        }
        if(isset($map['skills'])){
            if(!empty($map['skills'])){
                $model->skills = [];
                $n = 0;
                foreach($map['skills'] as $item) {
                    $model->skills[$n++] = null !== $item ? OpenApiSkillInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // createSkillPlugin返回插件ID
    /**
     * @var string
     */
    public $pluginId;

    // 已解析文件名
    /**
     * @var string
     */
    public $fileName;

    // 已保存包版本摘要
    /**
     * @var string
     */
    public $revision;

    /**
     * @var int
     */
    public $skillCount;

    /**
     * @var OpenApiSkillInfo[]
     */
    public $skills;

}
