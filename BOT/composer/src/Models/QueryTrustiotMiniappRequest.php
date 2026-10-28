<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\AccessScopeItem;

class QueryTrustiotMiniappRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceNo' => 'trace_no',
        'channel' => 'channel',
        'visitUserId' => 'visit_user_id',
        'accessType' => 'access_type',
        'scene' => 'scene',
        'subjectRole' => 'subject_role',
        'subjectId' => 'subject_id',
        'accessScope' => 'access_scope',
    ];
    public function validate() {
        Model::validateRequired('traceNo', $this->traceNo, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('accessType', $this->accessType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->traceNo) {
            $res['trace_no'] = $this->traceNo;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->visitUserId) {
            $res['visit_user_id'] = $this->visitUserId;
        }
        if (null !== $this->accessType) {
            $res['access_type'] = $this->accessType;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->subjectRole) {
            $res['subject_role'] = $this->subjectRole;
        }
        if (null !== $this->subjectId) {
            $res['subject_id'] = $this->subjectId;
        }
        if (null !== $this->accessScope) {
            $res['access_scope'] = [];
            if(null !== $this->accessScope && is_array($this->accessScope)){
                $n = 0;
                foreach($this->accessScope as $item){
                    $res['access_scope'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTrustiotMiniappRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trace_no'])){
            $model->traceNo = $map['trace_no'];
        }
        if(isset($map['channel'])){
            $model->channel = $map['channel'];
        }
        if(isset($map['visit_user_id'])){
            $model->visitUserId = $map['visit_user_id'];
        }
        if(isset($map['access_type'])){
            $model->accessType = $map['access_type'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['subject_role'])){
            $model->subjectRole = $map['subject_role'];
        }
        if(isset($map['subject_id'])){
            $model->subjectId = $map['subject_id'];
        }
        if(isset($map['access_scope'])){
            if(!empty($map['access_scope'])){
                $model->accessScope = [];
                $n = 0;
                foreach($map['access_scope'] as $item) {
                    $model->accessScope[$n++] = null !== $item ? AccessScopeItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 跳转流水号，全局唯一
    /**
     * @var string
     */
    public $traceNo;

    // 链接渠道：H5 或 MINIAPP，缺省按 MINIAPP
    /**
     * @var string
     */
    public $channel;

    // 客户自定义的 C 端用户唯一标识，H5 必传、MINIAPP 禁传
    /**
     * @var string
     */
    public $visitUserId;

    // 访问类型：0 主体访问（按主体人解析其可访问设备）、1 设备清单访问（显式传入范围）
    /**
     * @var string
     */
    public $accessType;

    // 场景码。主体访问必填（按场景解析该主体的可访问设备）；清单访问不使用顶层 scene，以 access_scope 各项内的场景为准
    /**
     * @var string
     */
    public $scene;

    // 主体访问的范围口径，与 subject_id 联合解析：0 产权人 / 1 运营人 / 2 科技主体
    /**
     * @var string
     */
    public $subjectRole;

    // 主体访问的主键标识：主体人 ID 或统一社会信用代码等唯一标识
    /**
     * @var string
     */
    public $subjectId;

    // 设备清单访问（access_type=1 或缺省）的访问范围项集合。每项声明一个场景及该场景下的访问目标（设备清单），多项并集生效、顺序不影响结果。类型1 必填；主体访问不使用本字段
    /**
     * @var AccessScopeItem[]
     */
    public $accessScope;

}
